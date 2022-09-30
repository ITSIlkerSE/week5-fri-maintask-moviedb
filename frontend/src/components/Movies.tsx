import {Movie} from "../model/Movie";

export type MoviesProps = {

    movie: Movie;

}

export default function Movies(props: MoviesProps){


return(

    <div className={"MoviesWindow"}>

        <p>{props.movie.title} {props.movie.year} </p>

        <p><em><img src = {props.movie.url}/></em></p>



    </div>
)

}