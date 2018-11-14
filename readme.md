Filebox is a simple pet project to store files in "the cloud".

This type of functionality is already widely available elsewhere (e.g., Dropbox), so this project is mainly a way to experiment with the AWS S3 APIs, and the available encryption options.

To start the server:

    mvn spring-boot:run

Or any of the other options listed at https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-running-your-application.html

Prerequistes:
* Have AWS credentials in a "filebox" profile in ~/.aws/credentials (I haven't figured out how to do this on any final live prod server; it will likely involve using STS. AWS credentials can be tricky. See Named Profiles (https://docs.aws.amazon.com/cli/latest/userguide/cli-multiple-profiles.html) and https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/credentials.html


TODOs
* Perform basic upload/download using AWS SDK
* Evaluate encryption options - likely Amazon S3-Managed Keys (SSE-S3), but also look at the need for bucket policies to reject PUT requests without encryption information.
* Create basic UI

NiceTODOs
* Give AWS IAM user access to only the filebox bucket

ToDones
* Create bucket
* Upload an example file via the AWS UI (https://s3.console.aws.amazon.com/s3)
* Perform basic upload download using AWS CLI
