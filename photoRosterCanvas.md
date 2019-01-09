# Photo Roster Chrome Canvas Code

```
var newDiv = $('<div>');
$('.collectionViewItems tr').each(function(){
 var avatar = $(this).find('.avatar').css('background-image').replace('url(','').replace(')','');
 var member = $('<div class="member" style="width:120px;height:160px;float: left;margin: 2px;"><div class="memberImg" style="text-align:center; height:120px; width:120px;"><span style="display: inline-block; height: 100%; vertical-align: middle;"></span><img style="max-width: 120px; max-height: 120px; vertical-align: middle;" src=' + avatar + '></div><div class="memberName" style="text-align:center">' + $(this).find('.roster_user_name').html() + '</div></div>');
 newDiv.append(member);
});
newDiv.appendTo('.v-gutter');
$('div[data-view="users"]').remove()
```
