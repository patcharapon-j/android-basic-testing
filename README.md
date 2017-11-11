# android-basic-testing

Workshop of Basic Unit testing for Android app

* Fork
* Clone
* Coding
* Testing
* Push

Let's start ...

# คำอธิบาย Test Case ที่สร้าง
## UI Test
### MainActivityTest.java
เป็น class ที่ใช้ทดสอบ UI ด้วย Espresso
* revertTest - ทดสอบการกดปุ่ม Revert แล้วต้องล้างค่าทั้งหมด
* saveSuccessfulTest - ทดสอบการกดปุ่ม Save โดยที่ใส่ข้อมูลทั้งหมดถูกต้อง ผลต้องขึ้น Toast แสดงการบันทึกสำเร็จ "Save Successful"
* saveFailNoName - ทดสอบการกดปุ่ม Save โดยที่ไม่ใส่ Name ผลต้องขึ้น Toast แสดงข้อผิดพลาด "Name is Empty String"
* saveFailNoEmail - ทดสอบการกดปุ่ม Save โดยที่ไม่ใส่ Email ผลต้องขึ้น Toast แสดงข้อผิดพลาด "Email is Empty"
* saveFailInvalidName - ทดสอบการกดปุ่ม Save โดยที่ใส่ Name ผิดรูปแบบ ผลต้องขึ้น Toast แสดงข้อผิดพลาด "Name contain non Alphabet Characters"
* saveFailInvalidEmail - ทดสอบการกดปุ่ม Save โดยที่ใส่ Email ผิดรูปแบบ ผลต้องขึ้น Toast แสดงข้อผิดพลาด "Email is Invalid"

## Unit Test
### EmailValidationFailTest.java
เป็น class ที่ใช้ทดสอบการ Validate Email โดยใน Class นี้จะมี Test Case ของรูปแบบ Email ที่ **ผิด** ทั้งหมด
* EmailIsNull - Email เป็นค่า Null
* EmailIsEmpty - Email เป็นค่า String เปล่า
* EmailIsRandomString - Email เป็น String ตัวอักษรสุ่ม
* EmailIsMissingName - Email ไม่มี Host name
* EmailIsMissingDomain - Email ไม่มี Domain
* EmailInvalidEnd - Email มีลงท้ายตัวตัวอักษรที่ไม่มีอยู่จริง
* EmailHaveDoubleAmpersan - Email มี @ ติดต่อกัน 2 ตัว
* EmailHaveDoubleDot - Email มีจุดติดต่อกัน 2 จุด
* EmailInvalidDot - Email ใส่จุดผิดที่

### EmailValidationPassTest.java
เป็น class ที่ใช้ทดสอบการ Validate Email โดยใน Class นี้จะมี Test Case ของรูปแบบ Email ที่ **ถุกต้อง** ทั้งหมด
* EmailStandart - Email ที่ไม่มี . ใน Host Name
* EmailWithDot - Email ที่มี . ใน Host Name
* EmailWithDotEnd - Email ที่มี . ใน Domain Name
* EmailWithStrangeEnd - Email ที่มีลงท้าย Domain ไม่ทั่วไป

### NameValidationFailTest.java
เป็น class ที่ใช้ทดสอบการ Validate Email โดยใน Class นี้จะมี Test Case ของรูปแบบ Name ที่ **ผิด** ทั้งหมด
* NameIsNull - ชื่อเป็นค่า Null
* NameIsEmptyString - ชื่อเป็น String เปล่า
* NameContainNumber - ชื่อทีตัวเลข
* NameContainSpecialCharacter - ชื่อมีอักขระพิเศษ
* NameIsNonEnglish - ชื่อไม่ใช่ภาษาอังกฤษ

### NameValidationPassTest.java
เป็น class ที่ใช้ทดสอบการ Validate Email โดยใน Class นี้จะมี Test Case ของรูปแบบ Name ที่ **ถูก** ทั้งหมด
* NameIsSingleCharacter - ชื่อตัวอักษรเดียว
* NameIsSingleWord - ชื่ออย่างเดียว
* NameIsFullName - ชื่อและนามสกุล
* NameisFullNameWithMiddleName - ชื่อ นามสกุล และชื่อกลาง
