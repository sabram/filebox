Filebox is a simple pet project to store files "in the cloud". 

This type of functionality is already widely available elsewhere (e.g., Dropbox), so this project is mainly a way to experiment with the AWS S3 APIs, and the available encryption options.

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
