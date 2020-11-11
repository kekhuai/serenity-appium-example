Feature: Buy now

  Customer can purchase products

  Scenario: Create purchase order successfully
    Given Natthachayakorn is on the Nextershop home page
    And he tries to close the popup if there is any
    And he goes to login page
    And he enters an email as "heretic.kekhuay@gmail.com"
    And he enters a password as "L^opNso7j'nex"
    And he clicks the submit button
    And he open the product selection dropdown
    And he select "ปูนซีเมนต์ อิฐมวลเบา อิฐบล็อก คานทับหลัง" category
    And he select "ปูนซีเมนต์สำเร็จรูป" sub-category
    And he select "ปูนเสือ มอร์ตาร์ ฉาบทั่วไปแพลทินัมXpert 50กก." product
#    And he select "กรุงเทพมหานคร" province
#    And he select "พระนคร" district
#    And he select "พระบรมมหาราชวัง" sub-district
#    And he select "10200" post code
#    And he selects his first shipping address
    And he tries to check the stock
    And he add the product to cart
    And he goes to cart page
    And he goes to payment page
    When he pays with internet banking
    Then he must be redirected to thank you page
