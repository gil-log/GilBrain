-- 코드를 입력하세요
SELECT cartOne.CART_ID
FROM CART_PRODUCTS cartOne, CART_PRODUCTS cartTwo
WHERE cartOne.NAME = 'Milk'
AND cartTwo.NAME = 'Yogurt'
AND cartOne.CART_ID = cartTwo.CART_ID
GROUP BY cartOne.CART_ID
ORDER BY cartOne.CART_ID