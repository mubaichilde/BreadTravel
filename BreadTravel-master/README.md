# �������url
###�����μ�api
* �����μ���ҳapi  GET����ʽ
```
http://api.breadtrip.com/v2/index/
```
* �����μ�item��������������  2387246443 �����id ����������������п����ҵ���GET��ʽ����
```
http://api.breadtrip.com/trips/2387246443/waypoints/
```

###�������
* ���ų���()
```
http://api.breadtrip.com/product/search/hot/
```

* ȫ����������api  ����start   ��ʼλ��   countһ�ζ�������  country���Ҵ���(ȫ�������ǩ��0)
```
http://web.breadtrip.com/product/topics/more/?start=0&count=10&country=0
```
* ���û��Ƶķ����ˣ�ԭ������Ӧ�û��и��ӿ��������item���ݣ������ұ���Ҳû�У�������ԭ������ҳ������js������ country  ��Ӧ������� data-id
```
 <p>
            <a class="cur" data-id="0" href="###">ȫ��</a>
            
            <a href="###" data-id="3649">̩��</a>
            
            <a href="###" data-id="3808">�ձ�</a>
            
            <a href="###" data-id="3238">����</a>
            
            <a href="###" data-id="3803">����</a>
            
            <a href="###" data-id="3814">���</a>
            
            <a href="###" data-id="3660">̨��</a>
            
            <a href="###" data-id="3589">�¼���</a>
            
            <a href="###" data-id="3821">ӡ��������</a>
            
            <a href="###" data-id="3708">Խ��</a>
            
            <a href="###" data-id="3720">�����</a>
            
            <a href="###" data-id="3793">�й�</a>
            
        </p>

```
###��������
*  3/10052/   ����ֶ���Ҫ�ڹ�������Ŀ�ĵ�������   "type": 3, "id": 10052,
```
http://api.breadtrip.com/destination/place/3/10052/
```
#####��������֮��
*�����ɴ��

```
http://web.breadtrip.com/mobile/destination/3/10052/intro/
```
* ���ξ��� item  ������all/mall/sights/hotel/restaurant/experience/��<br>�ֱ��Ӧȫ��/����/����/ס��/����/��������
```
http://api.breadtrip.com/destination/place/3/10052/pois/all/?start=0&count=20&sort=default&shift=false&latitude=39.959922249613754&longitude=116.45596566529844
```
* item���
```
http://api.breadtrip.com/destination/place/5/2388521355/
```
* �����(��Ҫץȡ��������ʾwebview��������Ҫʵ�ʲ���)http://web.breadtrip.com/mobile/destination/3/10052/top10_list/(��ȡ��������)<br>   <li data-url="http://breadtrip.com/mobile/destination/496/"�������top�ĵ����ת  Ҳ��webview����jsoupץȡһ��
```
  <ul class="dest-list">
            <li data-url="http://breadtrip.com/mobile/destination/495/" style="background-image: url(http://photos.breadtrip.com/photo_2014_10_31_df0632f2c47ccbc78713f2d95181df30.jpg?imageView/2/w/640/q/85);">
                <div class="title">����TOP5</div>
                <div class="bg"></div>
            </li>
            <li data-url="http://breadtrip.com/mobile/destination/496/" style="background-image: url(http://photos.breadtrip.com/photo_2014_03_23_ec14356642b72d6165d97343edef1fc1.jpg?imageView/2/w/640/q/85);">
                <div class="title">����TOP5</div>
                <div class="bg"></div>
            </li>
            <li data-url="http://breadtrip.com/mobile/destination/497/" style="background-image: url(http://photos.breadtrip.com/photo_2014_04_02_8b4717c8a1e770255eaf5e0d86a96fe9.jpg?imageView/2/w/960/q/85);">
                <div class="title">ס��TOP5</div>
                <div class="bg"></div>
            </li>
        </ul>
```
* http://web.breadtrip.com/mobile/destination/495/��top  item���֮��<br>�������data-id��data-type ��������Ҫ�ģ�����ƴ����ת�����徰��<br>background-image��url����Ϊ��ʾ������ͼƬ
```
 <li data-name="������԰" data-id="2388363531" data-type="5" style="background-image: url(http://photos.breadtrip.com/covers_2015_10_22_d4e479f2e7aea0079c50d1e761cba0d9.jpg?imageView/2/w/960/q/85);">
            <div>
                <h3>������԰</h3>
                <p>������԰�ڼ����������󲿷ֵ���ʤ�ż�������ɽ�������¡����մ��硢��������ݵȶ���������ձ��ִ���԰������֮һ��԰���������Ϸ��¹Ⱥ����Щ¹��ָ��Ϊ���ҵ���Ȼ�������һ���ļ����ۺ�ʱ�����ﶼ�������˵ľ��ۡ�</p>
            </div>
            <i>1</i>
        </li>

```
* ����ԭ�� ���Լ�ȥ����ҳ  ����item���ȥ��url <br>     http://api.breadtrip.com/trips/2387869041/waypoints/��
```
http://api.breadtrip.com/v2/destination/place/3/10052/trips/?start=0&count=20
```
* ʵ����֪
```
http://web.breadtrip.com/mobile/destination/3/10052/overview/
```



###�������url��keyֵ�������ˣ����Ӧ��ʵ�ֲ���(�����ƽ��˿���)���㰢�裬������һ�£�ֱ�Ӵ������Ҳ�С���������
```
http://api.breadtrip.com/v2/search/?key=%E5%8C%97%E4%BA%AC&start=0&count=20&data_type=
```