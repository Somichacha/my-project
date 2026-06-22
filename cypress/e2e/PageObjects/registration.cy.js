 import {faker} from '@faker-js/faker'
 import * as locators from './locators.js';
 const fullName = faker.person.fullName()
 const country = faker.location.country()
 const account = faker.helpers.arrayElement(['Private Job', 'Government Job', 'Student'])
 const email = faker.internet.email()
 const password = faker.internet.password()
 

console.log(fullName)
console.log(country)
console.log(account)
console.log(email)
console.log(password)



 describe('Registration', () => {
  beforeEach(() => {
    cy.visit(locators.URL);
  })

     it('user should be able to register account', () => {
      cy.get('button').first().click({ force: true })
      cy.get(locators.registrationbutton).click();
      cy.get(locators.namefield).type(fullName)
      cy.get(locators.selectcountryfield).select(country)
      cy.get(locators.selectaccountfield).select(account)
      cy.get(locators.emailfield).type(email)
      cy.get(locators.passwordfield).type(password)
      cy.get(locators.confirmpasswordfield).type(password)
      cy.get(locators.signupbutton).click()
      cy.get(locators.successmessage).should('have.text', 'Registration Successful')

      })
    })
