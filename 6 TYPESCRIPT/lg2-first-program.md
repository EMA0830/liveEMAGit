:books: **Product Catalog Management System**

:beginner: _**setup**_

https://nodejs.org/dist/v14.15.4/node-v14.15.4-x64.msi
https://git-scm.com/downloads
https://code.visualstudio.com/download

```js
node --version
npm --version
git --version

npm install --global typescript@4.2.2
tsc --version
```
:beginner: _**Initializing the Project**_
- folder : PCMSysv1
```js
git init
npm init --yes
```

:bulb: `npm help init` for definitive documentation

The npm init command creates a package.json file, which is used to keep track of the packages required by the project and also to configure the development tools.

:one: _Creating the Compiler Configuration File_  

tsc compiler : compiles TypeScript to JavaScript

- `tsconfig.json` PCMSysv1 : configuration for the TypeScript compiler
```js
{
"compilerOptions": {
"target": "es2018",
"outDir": "./dist",
"rootDir": "./src",
"module": "commonjs"
}
}
```
https://en.wikipedia.org/wiki/ECMAScript
What is CommonJS? CommonJS is a module formatting system. It is a standard for structuring and organizing JavaScript code. CJS assists in the server-side development of apps and it’s format has heavily influenced NodeJS’s module management.


:two: _TypeScript Code File_  
- `index.ts` :PCMSysv1\src
```ts
console.clear();
console.log("Product Catalog Management System ");
// datatypes
var x; // undefined
x = 10;
console.log(x);
x = 1.05;
console.log(x);
x = "welcome";
console.log(x);
x = true;
console.log(x);
```
:three: _Compiling and Executing the Code_  

`tsc`

The compiler reads the configuration settings in the tsconfig.json file and locates the TypeScript files in the src folder. The compiler creates the dist folder and uses it to write out the JavaScript code. If you examine the dist folder, you will see that it contains an index.js file, where the js file
extension indicates the file contains JavaScript code. If you examine the contents
of the index.js file

```js
node dist/index.js
```