@Grab('org.gebish:geb-core')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {
   //URL���R�s�y����Ƃ��͉~�}�[�N���X���b�V���ɒ������ƁI
   go 'file:///D:/Temp/handson/introWork/Introwork_�N���X.html'
   
   //�V���v���Ɏ擾����ꍇ
   assert $("p.test2").text() == "test1.test2"
   
   //p�^�O�Ɉ͂܂�Ă��Ȃ�class=test2���Ă΂��
   assert $("div",class:"test2").text() == "test2"
   //p�^�O�Ɉ͂܂�Ă���class=test2��I�ԏꍇ
   assert $("div").find(".test2").text() == "test1.test2"
   assert $("div").filter(".test2").text() == "test2"
   
   //not���\�b�h���g���ꍇ
   assert $(".test2").not("p").text() == "test2"
   //has���\�b�h���g���ꍇ
   assert $("div").has("p").text() == "test1.test2"
   

   
   
   
}