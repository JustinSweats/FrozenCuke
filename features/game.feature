Feature: We're gonna do some shit with gamefaqs my guy

  @Clao
  Scenario Outline: I'm about to navigate to a pic on the gamefaqs page
    Given I am at the gamefaqs page
    When I check the title
    Then I see that it is the same as <title>

    Examples:
    |title|
    |GameFAQs - Video Game Cheats, Reviews, FAQs, Message Boards, and More|
