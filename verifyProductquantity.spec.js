import{test, expect, chromium}from '@playwright/test'
import { text } from 'stream/consumers';
test('verifyProductquantity', async()=>{
    const browser = await chromium.launch();
    const context = await browser.newContext();
    const page = await context.newPage();
    await page.goto('https://www.automationexercise.com/');
    await expect(page).toHaveURL('https://www.automationexercise.com/');
    await page.click('a[href="/product_details/1"]');
    await expect(page.locator('div[class="product-information"]')).toBeVisible({timeout:3000});
    const quantityInput = page.locator('input[name="quantity"]');
    await quantityInput.fill('4');
    await page.locator('button:has-text("Add to cart")').click();
    await page.locator('a[href="/view_cart"]').filter({ hasText:'View Cart'}).click();
    const cartQuantity = page.locator('td[class="cart_quantity"]');
    await expect(cartQuantity).toHaveText('4');
});