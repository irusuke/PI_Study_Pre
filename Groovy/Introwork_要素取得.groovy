@Grab('org.gebish:geb-core')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {
   
   go 'file:///D:/Temp/handson/introWork/Introwork_�v�f�擾.html'
   
   assert $("p", attr1: "a").size() == 2
   assert $("p", attr2: "b").size() == 2
   assert $("p", attr3: "c").size() == 1
   
   assert $("p", attr1: "a", attr2: "b").size() == 1
   assert $("p", attr2: "c", attr3: "b").size() == 2
   
   assert $("p", text: ~/p./).size() == 5
   assert $("p", text: ~/.1/).size() == 1
   
   assert $("p", text: ~/p1/).size() == 1
   
   

}