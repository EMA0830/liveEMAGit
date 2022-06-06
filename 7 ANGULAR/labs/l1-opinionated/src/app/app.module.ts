import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { DummyComponent } from './dummy/dummy.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { FadeinDirective } from './fadein.directive';
import { NgGClassUserPipe } from './ng-g-class-user.pipe';

@NgModule({
  declarations: [
    AppComponent,
    DummyComponent,
    WelcomeComponent,
    FadeinDirective,
    NgGClassUserPipe
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
