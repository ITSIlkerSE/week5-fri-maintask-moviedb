import {useEffect, useState} from "react";
import axios from "axios";
import {Movie} from "../model/Movie";

export default function useMovies() {

    const [movies, setMovies] = useState([])
    useEffect(() => {
        getMovies()
    }, [])


    const getMovies = () => {
        axios.get("api/movie")
            .then((response) => response.data)
            .then((movies)=> setMovies(movies))


    }

    const addMovie = (movie: Movie) => {
        axios.post("api/movie" , movie)
            .then(getMovies)


    }

    return {movies, addMovie}

}