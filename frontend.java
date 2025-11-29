<!DOCTYPE html>
<html>
<head>
    <title>Simple Java Full-Stack Project</title>
    <style>
        body { 
            font-family: Arial; 
            padding: 30px; 
        }
        button {
            padding: 10px 20px;
            background: blue;
            color: white;
            border: none;
            cursor: pointer;
        }
        #output {
            margin-top: 20px;
            font-size: 20px;
            font-weight: bold;
            color: green;
        }
    </style>
</head>

<body>

<h2>Java Full Stack Demo</h2>

<button onclick="loadMessage()">Click to Load Message</button>

<p id="output"></p>

<script>
function loadMessage() {
    fetch("http://localhost:8080/message")
        .then(response => response.text())
        .then(data => {
            document.getElementById("output").innerText = data;
        })
        .catch(error => {
            document.getElementById("output").innerText = "Error connecting to backend!";
        });
}
</script>

</body>
</html>
