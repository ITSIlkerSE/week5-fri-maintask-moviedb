import {Movie} from "../model/Movie";
import Movies from "./Movies";
import {useState} from "react";

type MovieDbProps = {

    movies: Movie[]
    deleteMovie: (id: string) => void;

}

export default function MovieDb(props: MovieDbProps) {

    const [filterText, setFilterText] = useState("");

    const result = props.movies.filter((char) => char.title.toLocaleLowerCase().includes(filterText.toLocaleLowerCase()));


    return (


        <div className={"MovieContainer"}>


            //Todo conditional rendering  ?    :


            <p>Search: </p><input className={"input"} onChange={(event) =>
                setFilterText(event.target.value)}/>


            {result.map((movie) =>

                <Movies movie={movie} deleteMovie={props.deleteMovie}/>)}

        </div>

    )

}
