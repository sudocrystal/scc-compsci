# Want a photo roster of your students in Canvas?

Ask students to update their canvas account picture, then...

- Open Google Chrome
- Go to the People tab of Canvas for your course
- Right click somewhere on the webpage and choose "Inspect"
- Click on the console tab (you may need to click on the icon next to where it says 'Elements')
- Copy the code below
  - if you don't want your name to show on the roster, change where it says "Crystal Hess" to say your name instead
  - if you don't mind your name showing, then no changes are needed
  - _You may get a prompt that says to type "allow pasting"._ If you do, type "allow pasting", and then it will allow you to paste.
- Paste the code below into the console and hit enter
- Print your pretty photo roster! (I usually print to PDF and save.)
- No worries about the page looking like that forever. If you navigate away from the people page and then back, everything will return to normal!

# Photo Roster Chrome Canvas Code

## New code
```js
var newDiv = $('<div class="canvasPhotoRoster">');
var courseNumberAndSection = "<h3>" + $('nav[id="breadcrumbs"]').html().replaceAll("\n","").replace(/.*CS/, "CS").replace(/<.*/,"") + "</h3>";
newDiv.append(courseNumberAndSection);

$('.collectionViewItems tr').each(function(){

    var stuName = $(this).find('.roster_user_name').html();
    stuName = stuName.replaceAll("/Him","").replaceAll("/Her","").replaceAll("/Them","");
    //console.log($(this).html());
    //console.log(stuName);

    var avatar = $(this).html();
    avatar = avatar.replaceAll("\n","").replace(/.*src="/,"").replace(/".*/,"");
    //console.log(avatar);

    var label = "";
    //console.log($(this).find('.label'));
    if($(this).find('.label').length != 0) {
      label = "inactive";
    }

    var member = $('<div class="member" style="width:120px; height:140px; float: left; margin: 2px; padding: 5px;"><div class="memberImg" style="text-align:center; height:110px; width:110px;"><span style="display: inline-block; height: 100%; vertical-align: middle;"></span><img style="max-width: 110px; max-height: 110px; vertical-align: middle;" src=' + avatar + '></div><div class="memberName" style="text-align:center; text-size: 8px;">' + stuName + '</div></div>');

    if(!stuName.includes("Crystal Hess") && label != "inactive") {
      newDiv.append(member);
    }

});

newDiv.appendTo('.ic-Layout-contentWrapper');
$('div[id="content"]').remove();
```

## Old code
```js
var newDiv = $('<div>');
$('.collectionViewItems tr').each(function(){
 var avatar = $(this).find('.avatar').css('background-image').replace('url(','').replace(')','');
 var member = $('<div class="member" style="width:120px;height:160px;float: left;margin: 2px;"><div class="memberImg" style="text-align:center; height:120px; width:120px;"><span style="display: inline-block; height: 100%; vertical-align: middle;"></span><img style="max-width: 120px; max-height: 120px; vertical-align: middle;" src=' + avatar + '></div><div class="memberName" style="text-align:center">' + $(this).find('.roster_user_name').html() + '</div></div>');
 newDiv.append(member);
});
newDiv.appendTo('.v-gutter');
$('div[data-view="users"]').remove()
```
