@Grab('org.gebish:geb-core')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {
   //URL���R�s�y����Ƃ��͉~�}�[�N���X���b�V���ɒ������ƁI
   go 'file:///D:/Temp/handson/introWork/introWork_���������(name).html'
   
   assert title == 'IntroWork1_C'
  
   //name�w��ŗv�f�擾

   
   
}