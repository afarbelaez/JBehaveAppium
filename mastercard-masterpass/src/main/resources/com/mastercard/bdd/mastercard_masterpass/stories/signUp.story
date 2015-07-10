Scenario: SignUp
Given home mastercard page https://itf.masterpass.mastercard.com/
And I select country
Given Open SignUp page
Then message on the top of screen should appeared:
|message|
|Select your wallet below.|
