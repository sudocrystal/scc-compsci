# Want a photo roster of your students in Canvas?

Ask students to update their canvas account picture, then...

- Open Google Chrome (or Safari or Edge)
- Go to the People tab of Canvas for your course
- Right click somewhere on the webpage and choose "Inspect"
- Click on the console tab
  - you may need to click on the icon next to where it says 'Elements'
- Copy the code below
  - if you don't want your name to show on the roster, change where it says "Crystal Hess" to say your name instead
  - if you don't mind your name showing, then no changes are needed
- Paste the code below into the console and hit enter
  - _You may get a prompt that says to type "allow pasting"._ If you do, type "allow pasting", and then it will allow you to paste the code.
- Print your pretty photo roster! (I usually print to PDF and save.)
- No worries about the page looking like that forever. If you navigate away from the people page and then back, everything will return to normal!

# Photo Roster Chrome Canvas Code

## New code
```js
var instructor = "Crystal Hess";
var firstNamesOnly = false; 

var courseNumberAndSection = $('nav[id="breadcrumbs"]').html();
courseNumberAndSection = courseNumberAndSection.replaceAll("\n","").replace(/.*<a href="\/courses\/[0-9]+">/, "").replace(/<\/a.*/,"");
//console.log(courseNumberAndSection);

var newDiv = $('<div class="canvasPhotoRoster">');
newDiv.append("<h3>" + courseNumberAndSection + "</h3>");

$('.collectionViewItems tr').each(function() {

    var stuName = $(this).find('.roster_user_name').html();
    stuName = stuName.replaceAll("/Him","").replaceAll("/Her","").replaceAll("/Them","");
    if(firstNamesOnly && !stuName.includes(instructor) ) { 
       if(stuName.includes("(")) stuName = stuName.replace(/ .*\(/, " (");
       else stuName = stuName.replace(/ .*/, "");
    }
    //console.log(stuName);

    var avatar = $(this).html();
    avatar = avatar.replaceAll("\n","").replace(/.*src="/,"").replace(/".*/,"");
    //console.log(avatar);

    var label = "";
    //console.log($(this).find('.label'));
    if($(this).find('.label').length != 0) {
      label = "inactive";
    }

    var member = $('<div class="member" style="width:120px; height:140px; float: left; margin: 2px; padding: 5px;"><div class="memberImg" style="text-align:center; height:110px; width:110px;"><img style="max-width: 110px; max-height: 110px; vertical-align: middle;" src=' + avatar + '></div><div class="memberName" style="text-align:center;">' + stuName + '</div></div>');

    if(!stuName.includes(instructor) && label != "inactive") {
      newDiv.append(member);
    }

});

newDiv.appendTo('.ic-Layout-contentWrapper');
$('div[id="content"]').remove();
```
