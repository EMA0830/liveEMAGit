:beginner: _**Opinionated**_  
https://angular.io/cli/new
```sh
# no testing files
ng new l1-opinionated --minimal
```
```sh
# port 5000 / angular.json
        "serve": {
....
            "development": {
              "browserTarget": "d1-kriya:build:development",
              "port":5000
            }
          }
```
```sh
# create module
ng generate module user
ng g module user
# create component
ng g c user/user-login
# service
ng g service user/user-login
# inline template
ng g c welcome --inline-template
# directive
ng g directive fadein 
# filter
ng g pipe --skip-tests
ng g class user
```
```json
// generate external template,style,test
      "schematics": {
        "@schematics/angular:component": {
          "inlineTemplate": false,
          "inlineStyle": false,
          "skipTests": false
        },
```
