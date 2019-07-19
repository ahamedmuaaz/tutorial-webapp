function confirmAdd(id){
    alert("Tutorial successfully Added!");
}

function update(){
    alert("Tutorial successfully Updated!");
}

function confirmDelete(id) {
    if (confirm('Are you sure you want to Delete this Tutorial')) {
        console.log(id);

        window.location.assign("/admin/deleteTut?id=" + id);
        alert("Tutorial successfully deleted!");

        // Save it!
    } else {
        alert("Tutorial not deleted!");
    }
}
function confirmUpdate(id) {

    window.location.assign("/admin/edit?id=" + id);

}

function viewMethod(id) {
    window.location.assign("/admin/tut?id=" + id);
}
function viewStudentMethod(id) {
    window.location.assign("/student/view?id=" + id);
}