package estudo.individual.API.Java.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class HomeController {

    @GetMapping
    public ResponseEntity<String> home(){
        return ResponseEntity.ok(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"pt-BR\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "    <title>Aplicativo Todo</title>\n" +
                        "    <style>\n" +
                        "        body {\n" +
                        "            font-family: Arial, sans-serif;\n" +
                        "            display: flex;\n" +
                        "            justify-content: center;\n" +
                        "            align-items: center;\n" +
                        "            height: 100vh;\n" +
                        "            background-color: #f4f4f4;\n" +
                        "        }\n" +
                        "        .todo-container {\n" +
                        "            background: white;\n" +
                        "            padding: 20px;\n" +
                        "            border-radius: 5px;\n" +
                        "            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n" +
                        "        }\n" +
                        "        .todo-container h2 {\n" +
                        "            margin-top: 0;\n" +
                        "        }\n" +
                        "        .todo-input {\n" +
                        "            width: calc(100% - 40px);\n" +
                        "            padding: 10px;\n" +
                        "            border: 1px solid #ddd;\n" +
                        "            border-radius: 3px;\n" +
                        "            margin-bottom: 10px;\n" +
                        "        }\n" +
                        "        .todo-button {\n" +
                        "            width: 100%;\n" +
                        "            padding: 10px;\n" +
                        "            border: none;\n" +
                        "            border-radius: 3px;\n" +
                        "            background-color: #28a745;\n" +
                        "            color: white;\n" +
                        "            cursor: pointer;\n" +
                        "            font-size: 16px;\n" +
                        "        }\n" +
                        "        .todo-button:hover {\n" +
                        "            background-color: #218838;\n" +
                        "        }\n" +
                        "        .todo-list {\n" +
                        "            list-style: none;\n" +
                        "            padding: 0;\n" +
                        "        }\n" +
                        "        .todo-item {\n" +
                        "            display: flex;\n" +
                        "            justify-content: space-between;\n" +
                        "            align-items: center;\n" +
                        "            padding: 10px;\n" +
                        "            border-bottom: 1px solid #ddd;\n" +
                        "        }\n" +
                        "        .todo-item.completed {\n" +
                        "            text-decoration: line-through;\n" +
                        "            color: #888;\n" +
                        "        }\n" +
                        "        .todo-item button {\n" +
                        "            border: none;\n" +
                        "            background: none;\n" +
                        "            cursor: pointer;\n" +
                        "            font-size: 16px;\n" +
                        "        }\n" +
                        "    </style>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "    <div class=\"todo-container\">\n" +
                        "        <h2>Lista de Tarefas</h2>\n" +
                        "        <input type=\"text\" class=\"todo-input\" id=\"todo-input\" placeholder=\"Adicionar nova tarefa...\">\n" +
                        "        <button class=\"todo-button\" onclick=\"addTodo()\">Adicionar</button>\n" +
                        "        <ul class=\"todo-list\" id=\"todo-list\"></ul>\n" +
                        "    </div>\n" +
                        "\n" +
                        "    <script>\n" +
                        "        function addTodo() {\n" +
                        "            const todoInput = document.getElementById('todo-input');\n" +
                        "            const todoList = document.getElementById('todo-list');\n" +
                        "            const todoText = todoInput.value.trim();\n" +
                        "\n" +
                        "            if (todoText === '') {\n" +
                        "                alert('Por favor, insira uma tarefa.');\n" +
                        "                return;\n" +
                        "            }\n" +
                        "\n" +
                        "            const li = document.createElement('li');\n" +
                        "            li.className = 'todo-item';\n" +
                        "            li.innerHTML = `\n" +
                        "                <span>${todoText}</span>\n" +
                        "                <div>\n" +
                        "                    <button onclick=\"toggleComplete(this)\">✔\uFE0F</button>\n" +
                        "                    <button onclick=\"removeTodo(this)\">❌</button>\n" +
                        "                </div>\n" +
                        "            `;\n" +
                        "\n" +
                        "            todoList.appendChild(li);\n" +
                        "            todoInput.value = '';\n" +
                        "        }\n" +
                        "\n" +
                        "        function toggleComplete(button) {\n" +
                        "            const li = button.parentElement.parentElement;\n" +
                        "            li.classList.toggle('completed');\n" +
                        "        }\n" +
                        "\n" +
                        "        function removeTodo(button) {\n" +
                        "            const li = button.parentElement.parentElement;\n" +
                        "            li.remove();\n" +
                        "        }\n" +
                        "    </script>\n" +
                        "</body>\n" +
                        "</html>\n"
        );
    }
}
