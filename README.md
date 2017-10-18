//Max level sidekick
//eqit fiona
// pause   var i = this._cachedKeys[t]
var _r1 = new RegExp("Item:sidekick:.*");
 
for (var i = 0; i < e.instances.length; i++) {
    if (_r1.test(e.instances[i].modelID)) {
        e.instances[i].stats.maturity = 3;
        e.instances[i].stats.xp = 125800;
        e.instances[i].stats.zodiac = 2;
        e.instances[i].stats.zodiacBonus = 2;
    }
}
 
 
//InstanceCache.prototype.writeDirtyInstancesToState

.	BẮN CHO ĐỦ 1000 TIỀN VÀNG ĐỂ MUA NHÂN VẬT FIONA. Để nguyên màn hình ở chỗ nhân vật FIONA này
2.	MUA XONG, CHUỘT PHẢI -> CHỌN INSPECT
3.	CHỌN TAB CONSOLE
4.	Kéo lên xuống tìm file VMxxx:xxx (xxx là số), bấm vào
5.	Click vào nút Pretty Print {} ở dưới cùng bên trái khung soạn thảo
6.	Click chuột vào bên trong khung soạn thảo. Sau đó bấm tổ hợp phím Ctrl+F để bật ra khung tìm kiếm
7.	Dán dòng sau vào:

InstanceCache.prototype.writeDirtyInstancesToState

8.	Click vào hàng số thứ tự ở bên trái dòng nào có dạng như sau: 

var i = this._cachedKeys[t]

9.	Bên khung hiển thị trò chơi, bấm EQUIP, lúc này, bên khung soạn thảo code, dòng var i = this._cachedKeys[t] sẽ sáng lên
10.	Bấm vào tab CONSOLE
11.	Sao chép và dán lệnh sau vào rồi ENTER:

//Unlock all champions
var _r1= new RegExp("Item:.");
 
for(var i = 0; i < e.instances.length; i++) {
    if(_r1.test(e.instances[i].modelID)) {
        e.instances[i].state = "idle";
    }
	}

//MAX COINS
var _r1 = new RegExp("Currency:c.*");
 
for (var i = 0; i < e.instances.length; i++) {
    if (_r1.test(e.instances[i].modelID)) {
        e.instances[i].value = 999998;
    }
}
 
//MAX TROPHIES
var _r1 = new RegExp("Currency:t.*");
 
for (var i = 0; i < e.instances.length; i++) {
    if (_r1.test(e.instances[i].modelID)) {
        e.instances[i].value = 99998;
    }
}
 
//MAX LEVEL:
var _r1 = new RegExp("Item:pl.*");
 
for (var i = 0; i < e.instances.length; i++) {
    if (_r1.test(e.instances[i].modelID)) {
        e.instances[i].stats.xp = 2000000;
        e.instances[i].stats.lastClaimedLevel = 50;
    }
	}

//SET ALL CHAMPIONS  TO LEVEL 50
var _r1= new RegExp("Item:.");
for( var i = 0; i < e.instances.length; i++){
if(_r1.test(e.instances[i].modelID)){
e.instances[i].stats.level = 50;
}
}
 
//Get all new sidekicks
var count = e.instances.length - 6;
e.instances[count++].modelID = "Item:sidekick:FC14";
e.instances[count++].modelID = "Item:sidekick:LC11";
e.instances[count++].modelID = "Item:sidekick:NC11";
e.instances[count++].modelID = "Item:sidekick:SC12";
e.instances[count++].modelID = "Item:sidekick:WC15";
e.instances[count++].modelID = "Item:sidekick:PC00";
 
//Max Sidekick
for (var i = e.instances.length - 6; i < e.instances.length; i++) {
    e.instances[i].stats.xp = 125800;
    e.instances[i].stats.maturity = 3;
    e.instances[i].stats.zodiacBonus = 2;
}

12.	Bấm sang tab SOURCES, Click vào hàng số thứ tự ở bên trái dòng var i = this._cachedKeys[t]
13.	Bấm RESUME SCRIPT EXECUTION ở trên cùng bên PHẢI khung soạn thảo code. TẬN HƯỞNG NHÉ!
14.	BONUS: CÁCH ĐÁNH BOSS 1 HIT CHẾT LUÔN.
15.	Click vào BOSS RAIDS để chuẩn bị đánh BOSS. Giữ nguyên màn hình ở đấy chưa đc động thủ.
16.	CHUỘT PHẢI -> CHỌN INSPECT
17.	CHỌN TAB CONSOLE
18.	Kéo lên xuống để tìm VMxxx:xxx (xxx là số), Click vào nó
19.	Click vào nút Pretty Print {} ở dưới cùng bên trái khung soạn thảo
20.	Click chuột vào bên trong khung soạn thảo. Sau đó bấm tổ hợp phím Ctrl+F để bật ra khung tìm kiếm
21.	Dán dòng sau vào: 

this.doubleShotTimer.s

22.	Click vào hàng số thứ tự ở bên trái dòng nào có dạng như sau: this.magnetTimer.step(e)
23.	Bên khung hiển thị trò chơi, bấm FIGHT, lúc này, bên khung soạn thảo code, dòng this.magnetTimer.step(e) sẽ sáng lên
24.	Bấm vào tab CONSOLE
25.	Sao chép và dán lệnh: 

this.bossRaidDamage = 999999999

vào rồi ENTER
26.	Bấm sang tab SOURCES, Click vào hàng số thứ tự ở bên trái dòng this.magnetTimer.step(e)
27.	Bấm RESUME SCRIPT EXECUTION ở trên cùng bên trái khung soạn thảo code. Cho nhân vật đâm đầu vào quả lửa màu đỏ để chết là xong. Khi out ra sẽ thấy BOSS đã được KILL. TẬN HƯỞNG NHÉ!
