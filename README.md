## tc-online-review-persistence

All components for tc online review

### prerequisites
- java 7
- maven

### install libs

Run `./install-third-dep.sh` to install the libs into maven store

### package all components
- run `mvn clean package -Dhttps.protocols=TLSv1.2 -DskipTests`

### install all components
- run `mvn clean install -Dhttps.protocols=TLSv1.2 -DskipTests`
