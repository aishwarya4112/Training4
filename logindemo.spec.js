import{test, expect}from '@playwright/test'
test('logindemo', async({page}) =>{
    await page.goto('https://www.saucedemo.com/v1/');
    await page.fill('input[name="user-name"]','standard_user');
    await page.fill('input[name="password"]','secret_sauce');
    await page.click('input[type="submit"]');
    
});
    