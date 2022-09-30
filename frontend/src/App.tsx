import React from 'react';
import './App.css';
import useMovies from "./hooks/useMovies";
import AddMovie from "./components/AddMovie";
import MovieDb from "./components/MovieDb";

function App() {

const {addMovie, movies} = useMovies()


    return (
<body>
<div>
      <div className="App">
        <h1>Ilkers Videothek</h1>

</div>
    <MovieDb movies={movies}/>
    <AddMovie addMovie={addMovie}/>


</div>
</body>
  );
}

export default App;
