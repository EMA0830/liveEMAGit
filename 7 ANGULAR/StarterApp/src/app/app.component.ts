import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/service/books.service';
import { Book } from './model/book.model';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  // property
 title = 'Product Management App';
 books? : Book[];
 // inject service
 constructor(private bookService:BookService){}
 // fetch data 
 ngOnInit(): void {
   //subscribe to the observable
    this.bookService.getBooks().subscribe(
      (booksData : Book[]) => {
        this.books = booksData;
        console.log(this.books);
      }
    );
  }

}
