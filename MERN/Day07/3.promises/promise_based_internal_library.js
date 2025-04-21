// Designed by senior developer
// Not for junior developers

function getEmployeeByID(id) {
    const promise = new Promise((resolved, rejected) => {
        // operations of XHR
        if (id == 1)
            resolved({ "empid": 1, "name": "Anil", "salary": 10000, "deptno": 10 })
        else
            rejected({ "error": "Invalid Employee id" })
    })
    return promise
}

function getDepartmentDetails(deptno) {
    const promise = new Promise((resolved, rejected) => {
        // operations of XHR
        if (deptno == 10)
            resolved({ "deptno": 10, "dname": "Development", "location": "USA" })
        else
            rejected({ "error": "department does not exists" })
    })

    return promise

}