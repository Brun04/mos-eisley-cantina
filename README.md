# Menu Server (Mos-Eisley Cantina)

This app is a REST API which manage the menus of the Cantina.


## Usage

People from "Quality Assurance" say we can test the application manually with these HTTP requests:

```shell
# Display all menus
$ curl -XGET localhost:8080/menus

# Create a new menu "Menu de Noel" with the dish "Céréales sur lait"
$ curl -H "Content-Type: application/json"  -d '{"name": "Menu de Noel", "dishes": [{"name": "Céréales sur lait"}]}' http://localhost:8080/menus
```

 ______        ______                                                       
|   _  \      /  _   |   ____________     ______________                    __________    __	 ______________     __            __________    ___    ___
|  | \  \    /  / |  |  /   ______   \   |  ____________|                  |  ________|  |__| 	|  ____________|   |  |          |  ________|   \  \  /  /
|  |  \  \  /  /  |  |  |  /      \  |   |  |___________     __________    |  |___        __	|  |___________    |  |          |  |___         \  \/  /
|  |   \  \/  /   |  |  |  |      |  |   |___________   |   |__________|   |   ___|      |  |	|___________   |   |  |          |   ___|         \    /
|  |    \    /    |  |  |  \______/  |    ___________|  |                  |  |_______   |  | 	_______ ____|  |   |  |_______   |  |_______       |  |
|__|     \__/     |__|  \____________/   |______________|                  |__________|  |__|	|______________|   |__________|  |__________|      |__|   

