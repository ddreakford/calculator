# Steps to onboard the sample Calculator app to SeaLights
# Using the Gradle plugin

# Create the build session
# Run this from the calculator repo root dir...
java -jar sealights/sl-build-scanner.jar -gradle \
    -configfile sealights/sl-gradle.json \
    -workspacepath app

# Build and run unit tests
gradle clean build

# Restore the build.gradle file
# Run this from the calculator repo root dir...
java -jar sealights/sl-build-scanner.jar -restoreGradle -workspacepath app

# Manual tests
#
# Start the test stage
java -jar sealights/sl-test-listener.jar start \
    -tokenfile sealights/sltoken-dev-cs.txt \
    -buildsessionidfile buildSessionId.txt \
    -testStage "Manual Tests"
#
# Run the app with the test listener attached as a java agent
# java -cp app/build/libs/app.jar calculator.App
#
java -cp app/build/libs/app.jar \
    -javaagent:sealights/sl-test-listener.jar \
    -Dsl.tokenFile=sealights/sltoken-dev-cs.txt \
    -Dsl.buildSessionIdFile=buildSessionId.txt \
    -Dsl.tags="Calculator-Terminal" \
    -Dsl.testStage="Manual Tests" \
    -Dsl.filesStorage=sealights \
    calculator.App
#
# End the test stage
java -jar sealights/sl-test-listener.jar end \
    -tokenfile sealights/sltoken-dev-cs.txt \
    -buildsessionidfile buildSessionId.txt
