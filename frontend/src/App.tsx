import React from 'react';
import './App.css';
import useMovies from "./hooks/useMovies";
import AddMovie from "./components/AddMovie";
import MovieDb from "./components/MovieDb";

function App() {

const {addMovie, movies, deleteMovie} = useMovies()


    return (
<body>
<div>
      <div className="App">
        <h1>Movie Database</h1>

</div>
    <MovieDb movies={movies} deleteMovie={deleteMovie}/>

    <AddMovie addMovie={addMovie}/>


</div>
</body>
  );
}

export default App;
