:beginner: _**setup for json server**_  

:one: _install json server_  

```ts
npm install -g json-server
json-server --version
```

:two: _create products.json in data folder_  
```js
{
  "products": [
    {
      "productId": "P01",
      "productName": "Laptop",
      "price": 500.5
    },
    {
      "productId": "P02",
      "productName": "Mobile",
      "price": 50.5
    }
  ]
}
```
:three: _launch json server_  
```js
 json-server --watch products.json
```

:four: _test on browser / display products_  
```html
http://localhost:3000/products
```

:five: _add chrome extension JSON Formatter_  

:six: _install postman_  
https://dl.pstmn.io/download/latest/win64