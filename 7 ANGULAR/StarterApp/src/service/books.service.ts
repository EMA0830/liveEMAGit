
// class 
// BookService ob=new BookService();


import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Book } from "src/app/model/book.model";


// decorator
@Injectable(
    {
        providedIn : 'root'
    }
)
export class BookService{
    // constructor / httpClient is instantiated by angular and injected
    constructor(private httpClient : HttpClient) {

    }
    // variable to hold the books
    baseUrl: string = 'http://localhost:3000/books';

    getBooks() {
        // returns Observable
        return this.httpClient.get<Book[]>(this.baseUrl);
    }
}

