function addActor() {
        var count = 2;

        var div0 = document.getElementById("0");
        var div1 = document.getElementById("1");

        var divElement = document.createElement("div");
        divElement.id = '' + count;
        div0.appendChild(divElement);
        divElement.innerHTML = div1.innerHTML;

        var buttonDel = document.createElement("input");
        buttonDel.setAttribute("type", "button");
        buttonDel.setAttribute("class", "delete");
        buttonDel.setAttribute("title", "delete actor");
        buttonDel.setAttribute("value", "-");
        buttonDel.setAttribute("onclick", "deleteActor(" + count + "); return false");
        divElement.appendChild(buttonDel);

        count++;
}

function deleteActor(count) {
        document.getElementById(count).remove();
}