 describe('Login functionality', () => {
  beforeEach(() => {
    cy.visit('https://practice.qabrains.com')
  })

  
   it('should login with valid credentials', () => {
    cy.get('.text-3xl').should('have.text', 'QA Practice Site')
    cy.get('[name="email"]').type('qa_testers@qabrains.com')
    cy.get('[name="password"]').type('Password123')
    cy.get('.btn-submit').click()
    cy.get('.title').should('have.text','Login Successful')
   })

     it('Wrong username should display correct error message', () => {
    cy.get('[name="email"]').type('qa_testers@qabrains.co')
    cy.get('[name="password"]').type('Password123')
    cy.get('.btn-submit').click()
    cy.get('.title').should('have.text','Your email is invalid!')

     })
    it('Wrong password should display correct error message', () => {
    cy.get('[name="email"]').type('qa_testers@qabrains.com')
    cy.get('[name="password"]').type('Password12')
    cy.get('.btn-submit').click()
   cy.get('.title').should('have.text','Your password is invalid!')



  })
})
