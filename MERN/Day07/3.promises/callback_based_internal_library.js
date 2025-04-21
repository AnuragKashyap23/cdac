// Designed by senior developer
// Not for junior developers

function getEmployeeByID(id, fn) {
    // operations of XHR
    if (id == 1)
        fn({ "empid": 1, "name": "Anil", "salary": 10000, "deptno": 10 }, null)
    else
        fn(null, { "error": "Invalid Employee id" })
}

function getDepartmentDetails(deptno, fn) {
    // operations of XHR
    if (deptno == 10)
        fn({ "deptno": 10, "dname": "Development", "location": "USA" }, null)
    else
        fn(null, { "error": "department does not exists" })
}