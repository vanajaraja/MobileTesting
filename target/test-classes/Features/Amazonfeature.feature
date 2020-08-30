Feature: validate e2e scenario in Amazon

Scenario: verify that user can able to place an order

Given user should be in Amazon home page
When search a product and click on buy now
		|potty|
Then user should be navigated to payment page
