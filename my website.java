import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    System.out.println("Hello, Dcoder!");
   }
 }
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Custom Pokémon Card Shop</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
      background-color: #f8f8f8;
    }
    header {
      background-color: #4CAF50;
      color: white;
      padding: 15px;
      text-align: center;
    }
    .container {
      padding: 20px;
      display: flex;
      flex-wrap: wrap;
      justify-content: center;
      gap: 20px;
    }
    .card {
      background: white;
      border: 1px solid #ddd;
      border-radius: 8px;
      width: 300px;
      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
      text-align: center;
    }
    .card img {
      width: 100%;
      border-top-left-radius: 8px;
      border-top-right-radius: 8px;
    }
    .card h3 {
      font-size: 20px;
      margin: 15px 0;
    }
    .card p {
      color: #777;
      margin: 0 15px 15px;
    }
    .card button {
      background-color: #4CAF50;
      color: white;
      border: none;
      padding: 10px 15px;
      margin-bottom: 15px;
      border-radius: 5px;
      cursor: pointer;
    }
    .card button:hover {
      background-color: #45a049;
    }
    footer {
      background-color: #333;
      color: white;
      text-align: center;
      padding: 10px 0;
      margin-top: 20px;
    }
  </style>
</head>
<body>

<header>
  <h1>Custom Pokémon Card Shop</h1>
  <p>Your one-stop destination for unique Pokémon-inspired cards!</p>
</header>

<div class="container">
  <!-- Example Product 1 -->
  <div class="card">
    <img src="https://via.placeholder.com/300x200" alt="Card 1">
    <h3>Shiny Charizard EX</h3>
    <p>$25.00</p>
    <button>Add to Cart</button>
  </div>

  <!-- Example Product 2 -->
  <div class="card">
    <img src="https://via.placeholder.com/300x200" alt="Card 2">
    <h3>Custom Trainer Card</h3>
    <p>$30.00</p>
    <button>Add to Cart</button>
  </div>

  <!-- Example Product 3 -->
  <div class="card">
    <img src="https://via.placeholder.com/300x200" alt="Card 3">
    <h3>Legendary Booster Pack</h3>
    <p>$50.00</p>
    <button>Add to Cart</button>
  </div>
</div>

<footer>
  <p>© 2024 [Your Shop Name]. All rights reserved.</p>
</footer>

</body>
</html>
