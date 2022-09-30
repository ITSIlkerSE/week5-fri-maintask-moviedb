import {Movie} from "../model/Movie";
import {ChangeEvent, useState} from "react";

type addMovieProps = {

    addMovie: (movie: Movie) => void

}

export default function AddMovie(props: addMovieProps) {
    const [id, setId] = useState("")
    const [title, setTitle] = useState("")
    const [url, setUrl] = useState("")
    const [year, setYear] = useState("")



    const onTitleChange = (event: ChangeEvent<HTMLInputElement>) => {
        setTitle(event.target.value)
    }

    const onUrlChange = (event: ChangeEvent<HTMLInputElement>) => {
        setUrl(event.target.value)
    }

    const onYearChange = (event: ChangeEvent<HTMLInputElement>) => {
        setYear(event.target.value)
    }


    const onAddMovie = () => {

        let newMovie = {
            id: id,
            title: title,
            url: url,
            year: year

        }

        props.addMovie(newMovie)

    }

    return (


        <div className={"Inputs"}>

            <div>
                <p>Title</p>
                <input placeholder={"Give movie a title"} onChange={onTitleChange} value={title}/>
            </div>
            <div>
                <p>Url</p>
                <input placeholder={"url for image"} onChange={onUrlChange} value={url}/>
            </div>
            <div>
                <p>year</p>
                <input placeholder={"...."} onChange={onYearChange} value={year}/>
            </div>

            <button onClick={() => onAddMovie()}>Add Movie</button>


        </div>


    )

}