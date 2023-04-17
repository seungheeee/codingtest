SELECT DATE_FORMAT(SALES_DATE, '%Y-%m-%d') SALES_DATE,
       PRODUCT_ID,
       USER_ID,
       SALES_AMOUNT
FROM   (SELECT ONLINE_SALE_ID,
               USER_ID,
               PRODUCT_ID,
               SALES_AMOUNT,
               SALES_DATE
        FROM   ONLINE_SALE
        WHERE  YEAR(SALES_DATE) = 2022
               AND MONTH(SALES_DATE) = 3
        UNION ALL
        SELECT OFFLINE_SALE_ID,
               NULL AS USER_ID,
               PRODUCT_ID,
               SALES_AMOUNT,
               SALES_DATE
        FROM   OFFLINE_SALE
        WHERE  YEAR(SALES_DATE) = 2022
               AND MONTH(SALES_DATE) = 3)A
ORDER  BY SALES_DATE ASC,
          PRODUCT_ID ASC,
          USER_ID ASC 