let data = {
    "name" : "Suhana",
    "age" : 25,
    "is_student" : true,
    "Phone_no" : null,
    "prog_lang" : ["c", "C++", "java", "python", "php"],
    "adderss" : {
        "state" : "maharatra",
        "city" : "Mumbai",
        "street" : "bandra"
    }
}

let obj = JSON.parse(data) ;
console.log(obj) ;
