// class Account{

//     constructor(n, a){
//         this.Name = n;
//         this.Age = a;
//         console.log(this.constructor);
//     }
// };

// let a = new Account("Jishan", 26);

// let person = function (nm, ag) {
//     this.name = nm;
//     this.age = ag;
//     this.dojob = function () {
//         document.write("do-=== job hello<br/>");
//     }
// }
// let obj = new person("Raj", 25);
// // obj.dojob()
// document.write("<hr/>")
// for (let prop in obj) {
//     // if (typeof obj[prop] == "function")
//     //     obj[prop]();
//     document.write(prop + " " + obj[prop]);
//     document.write("<hr/>")
// }


// --------------------------------------------------- Abstract class -------------------------------------------------
// class Account {

//     constructor(fname, lname, amt) {
//         // alert(new.target)
//         if (new.target === Account) {
//             throw new TypeError("Cannot construct Abstract instances directly");
//         }
//         this.firstname = fname;
//         this.lastname = lname;
//         this.balance = amt;
//     }
//     set firstname(value) { this._fnm = value; }
//     get firstname() { return this._fnm; }

//     set balance(value) { this._bal = value; }
//     get balance() { return this._bal; }

//     set lastname(value) { this._lnm = value; }
//     get lastname() { return this._lnm; }
//     deposit(amt) { this.balance += amt; }
//     toString() { return this.firstname + "  " + this.lastname + " " + this.balance }
// }

// class Savingaccount extends Account {
//     constructor(acctype, fname, lname, amt) {
//         super(fname, lname, amt)
//         this.type = acctype;

//     }
//     withdraw(amt) {
//         const minbal = 1000;
//         if (amt > (this.balance - minbal))
//             throw new TypeError("err");
//         this.balance -= amt;

//     }
// };

// try {
//     var Aobj = new Account("Raj", "Mathur", 2000);
// } catch (e) {
//     console.log("Can not create the object of Account class");
// }

// var obj = new Savingaccount("sav", "Raj", "Mathur", 2000)
// obj.deposit(2000);
// document.write(obj);
// obj.withdraw(3000);
// document.write(obj);

class Account {
    #id;
    #firstname;
    #lastname;
    #balance;

    static #getid = 0;
    constructor(fn, ln, bal) {

        if(new.target === Account){
            throw new TypeError("Can not create the object of Account class");
        };

        this.#firstname = fn;
        this.#lastname = ln;
        this.#balance = bal;
        this.#id = ++Account.#getid;
    }

    set FirstName(value) {
        this.#firstname = value;
    }

    get FirstName() {
        return this.#firstname;
    }

    set LastName(value) {
        this.#lastname = value;
    }

    get LastName() {
        return this.#lastname;
    }

    set _cbalance(value) {
        this.#balance = value;
    }

    get _cbalance() {
        return this.#balance;
    }


    get gid() {
        return this.#id;
    }

    deposit(amt) {
        this._cbalance += amt;
    }

    toString() {
        return this.gid + " " + this.firstname + " " + this.lastname + " " + this._cbalance
    }

}

class Savingaccount extends Account {
    type;

    constructor(acctype, fname, lname, amt) {
        super(fname, lname, amt)
        this.type = acctype;
    }

    withdraw(amt) {
        const minbal = 1000;

        if (amt > (this._cbalance - minbal))
            throw new TypeError("err");

        this._cbalance = this._cbalance - amt;
    }
}

class currentAccount extends Account{

    type;

    constructor(acctype, fname, lname, amt) {
        super(fname, lname, amt)
        this.type = acctype;
    }

    withdraw(amt) {
        this._cbalance = this._cbalance - amt;
    }
}

try {
    var Aobj = new Account("Raj", "Mathur", 2000);
} catch (e) {
    console.log("Can not create the object of Account class");
}

// var obj = new Savingaccount("sav", "Parnav", "shidde", 5000);
// obj.deposit(2000);
// document.write(obj);

// obj.withdraw(1000);
// document.write(obj);


var obj = new currentAccount("cur", "Jishan", "Shaikh", 2000);
obj.deposit(2000);
obj.withdraw(5000);
console.log(obj._cbalance);




