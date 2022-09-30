import {Movie} from "../model/Movie";
import Movies from "./Movies";

type MovieDbProps = {

movies: Movie[]

}

export default function MovieDb (props: MovieDbProps) {

return(

    <div className={"MovieContainer"}>
        {props.movies.map((movie)=>

            <Movies movie={movie}/>)}

    </div>

)

}