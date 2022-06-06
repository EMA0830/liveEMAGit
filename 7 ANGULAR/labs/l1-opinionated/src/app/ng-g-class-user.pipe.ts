import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'ngGClassUser'
})
export class NgGClassUserPipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): unknown {
    return null;
  }

}
