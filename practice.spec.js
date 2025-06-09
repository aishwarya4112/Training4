import{test, expect, chromium}from '@playwright/test'
test('practice', async()=>{
    const browser = await chromium.launch();
    const context = await browser.newContext();
    const page = await context.newPage();

    await page.goto('https://automationexercise.com');
await expect(page).toHaveURL('https://automationexercise.com/');
await expect(page.locator('img[src="/static/images/home/logo.png"]')).toBeVisible();
await page.click('a[href="/login"]');
await expect(page.locator('text=New User Signup!')).toBeVisible();
await page.fill('input[data-qa="signup-name"]','Aishwaryaw');
await page.fill('input[data-qa="signup-email"]','aishwarya04test@test.com');
await page.click('button[data-qa="signup-button"]');
await expect(page.locator('text=Enter Account Information')).toBeVisible({timeout:5000});
await page.check('input[id="id_gender2"]');
await page.fill('input[id="password"]','Password1234');
await page.selectOption('select[id="days"]','4');
await page.selectOption('select[id="months"]','11');
await page.selectOption('select[id="years"]','1996');
await page.check('input[name="newsletter"]');
await page.check('input[name="optin"]');



    
});