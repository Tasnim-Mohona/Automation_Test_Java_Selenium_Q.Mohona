# Qualification Renewal Practical Task

## Task Description

1.  Implement both test cases using the framework from Unit 3, as well as the BDD tool from Unit 5.
2.  Make sure that the autotests are working and stable.

**Estimate:** 6h

## How to Complete the Task Successfully (What We Expect)

1.  The project provided in the repository builds and runs without errors (only failures due to caught site bugs are allowed).
2.  The project implements all the steps correctly. All necessary steps are implemented in the correct way, with no extra unnecessary steps.
3.  The student meets the estimate and deadline provided. Extra time may be provided only if requested *before* the deadline.

## How to Submit the Task

1.  Create a pull request in your private repository.
2.  Attach a screenshot of the Allure report as a comment in the same pull request (showing that both implemented tests are working fine).
3.  Request a review from `https://github.com/shinov42`.

---

## Test Case 1

**Topics:** Checkboxes, `isSelected()`, `refresh()`

**Preconditions:**

* The browser should be open in incognito mode.
* Go to `https://the-internet.herokuapp.com`

| Steps                        | Expected Results          |
| :--------------------------- | :------------------------ |
| 1. Click on the Checkboxes link | Page is open              |
| 2. Select Checkbox 1         | Checkbox 1 is selected    |
| 3. Refresh the page          | Checkbox 1 is not selected |

---

## Test Case 2

**Topics:** Window handles, `back()`, the page is displayed.

**Test Case**

**Preconditions:**

* The browser should be open in incognito mode.
* Go to `https://the-internet.herokuapp.com`

| Steps                                                          | Expected Results                                |
| :------------------------------------------------------------- | :---------------------------------------------- |
| 1. Scroll the page to the Multiple Windows link and click it | The "Click here" link is displayed            |
| 2. Click the "Click here" link                                 | The header of the opened tab is "New Window"  |
| 3. Go back to the main page using the browser navigation     | The main page is displayed                      |