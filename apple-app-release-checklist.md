# Apple App Release Checklist
*Ranked most → least important. Compiled October 2026; Apple's rules change often, so recheck the official App Store Review Guidelines before each submission: https://developer.apple.com/app-store/review/guidelines/*

---

## 1. Before you write code
- [ ] Get access to a Mac (Xcode runs only on macOS). A used Mac mini works.
- [ ] Use Xcode 26 or later with the iOS 26 SDK (required for all uploads since April 28, 2026)
- [ ] Join the Apple Developer Program ($99/year) when you're ready to test with others or publish
- [ ] Validate the idea: search Google Trends, Reddit, and the App Store for demand
- [ ] Read competitors' 1–2 star reviews to find gaps you can fill
- [ ] Make sure the app does more than wrap a website, and isn't a copy of an existing app

## 2. Build a finished, working app
- [ ] No crashes, bugs, broken links, or placeholder content
- [ ] Test on a real iPhone, not just the simulator
- [ ] Run an internal TestFlight test, then an external beta if possible
- [ ] Follow Apple's Human Interface Guidelines so the UI feels native

## 3. Help the App Reviewer
- [ ] Provide a working demo account and password if the app has a login
- [ ] Write specific Review Notes describing features and changes (generic notes get rejected)

## 4. Privacy
- [ ] Working privacy policy URL (required even if you collect no data)
- [ ] App Privacy "nutrition label" in App Store Connect matches what the app actually does
- [ ] Privacy manifest (PrivacyInfo.xcprivacy) declares any "required reason" APIs
- [ ] Every third-party SDK includes its own privacy manifest
- [ ] Ask for App Tracking Transparency permission if you track users across apps/sites

## 5. App Store listing
- [ ] Screenshots and description accurately match the current app
- [ ] Marketing images are suitable for all ages
- [ ] App name is 50 characters or fewer
- [ ] Working support URL with a real contact path (not just a social media profile)
- [ ] Icon and first two screenshots reviewed by someone outside the project

## 6. Age rating
- [ ] Complete the age rating questionnaire (ratings: 4+, 9+, 13+, 16+, 18+)
- [ ] Include AI chatbot/assistant features when judging content

## 7. Accounts and sign-in
- [ ] If users can create an account, they can delete it from inside the app (not just deactivate)
- [ ] If you offer Google/Facebook/etc. login, also offer Sign in with Apple
- [ ] When an account is deleted, revoke Sign in with Apple tokens

## 8. Payments
- [ ] Digital goods and subscriptions use Apple In-App Purchase (except allowed US external links)
- [ ] Enroll in the Small Business Program (15% commission under $1M/year)
- [ ] If using US external purchase links, request the External Purchase Link entitlement and watch for court-approved fee changes

## 9. User-generated or AI content
- [ ] Content moderation, reporting, and user blocking are in place
- [ ] AI tools prevent and remove prohibited content (including non-consensual imagery)

## 10. Laws and regulations
- [ ] **COPPA** (US): if the app targets or knowingly collects data from kids under 13, follow the amended rule (compliance required since April 22, 2026), including a written data-retention policy
- [ ] **State age laws** (Texas, Utah, Louisiana): implement the Declared Age Range API and PermissionKit's significant-change flow
- [ ] **EU Digital Services Act**: declare trader or non-trader status in App Store Connect (required for every account)
- [ ] **GDPR**: follow EU data protection rules if available in the EU
- [ ] **Export compliance**: set `ITSAppUsesNonExemptEncryption` = NO in Info.plist if you only use built-in encryption like HTTPS
- [ ] Health, finance, or gambling apps: check for extra licensing and legal requirements

## 11. Launch and growth
- [ ] Treat launching as a separate project from building; plan marketing early
- [ ] Build a TestFlight beta group and share progress before launch
- [ ] Optimize the title, subtitle, and keywords (App Store Optimization)
- [ ] Ask for ratings right after a user succeeds at something, never on first launch
- [ ] Plan monetization before launch, not after
- [ ] If rejected, read the cited guideline, fix it, and resubmit (or appeal)
- [ ] Keep updating; most first versions aren't hits

---

## Beginner learning path
- [ ] Learn Swift and SwiftUI (free: Apple's "Develop in Swift" tutorials, Hacking with Swift's "100 Days of SwiftUI")
- [ ] Read Apple's Human Interface Guidelines
- [ ] Start with a tiny app (one screen, one job) and finish it
- [ ] Test on your own iPhone with a free Apple Account before paying for the program
- [ ] Use Git from day one
- [ ] Read the full App Store Review Guidelines once before your first submission
