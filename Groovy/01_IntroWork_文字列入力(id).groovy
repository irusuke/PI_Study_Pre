@Grab('org.gebish:geb-core')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {
   //URL���R�s�y����Ƃ��͉~�}�[�N���X���b�V���ɒ������ƁI
   go 'file:///D:/Temp/handson/introWork/introWork_���������(id).html'
   //go 'https://www.google.co.jp/'
   
   assert title == 'IntroWork1_B'
   //assert title == 'Google'
  
   //ID�w��Ńe�L�X�g���w�肵�A����'test1'�Ɠ��͂��Ă�������
   
   
   
   sleep(3000)
}