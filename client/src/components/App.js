import React, {Component} from 'react';
import {connect} from 'react-redux';

import './App.css';
import RestaurantList from './RestaurantList';
import {getRestaurants} from "../actions/mainActions";
import RestaurantAdd from "./RestaurantAdd";
import RestaurantEdit from './RestaurantEdit';

class App extends Component {

    componentDidMount() {
        this.props.getRestaurants();
    }

    get currentComponent() {
        if(this.props.url === '/restaurants/new') return <RestaurantAdd/>;
        if(/\/restaurants\/[0-9]*/.test(this.props.url)) return <RestaurantEdit/>;
        return <RestaurantList/>;
    }

    render() {
        return (
            <div className="App">
                {this.currentComponent}
            </div>
        );
    }
}

const mapStateToProps = (state) => {
    return {
        url: state.router.pathname
    }
}

const mapDispatchToProps = (dispatch) => {
    return {
        getRestaurants: () => dispatch(getRestaurants())
    }
};

export default connect(mapStateToProps, mapDispatchToProps)(App);
