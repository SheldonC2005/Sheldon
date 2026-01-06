library(ggplot2)
#Q1
x<-c(2,3,8,4,12,15,10)
y<-c(1,5,7,8,12,11,14)
ggplot(data=NULL,aes(x=x,y=y))+
  geom_point(color='blue',size=3)+
  ggtitle('Scatter Plot')+
  xlab('X-axis')+
  ylab('Y-axis')

#Q2
month<-c(2015,2016,2017,2018,2019,2020)
sales<-c(150,250,200,385,180,400)
ggplot(data=NULL,aes(x=month,y=sales))+
  geom_line(color='red',linewidth=1)+
  ggtitle('Yearly Sales')+
  xlab('Year')+
  ylab('Sales(in Millions)')

#Q3
data=data.frame(Course=c('Maths','Science','English','History','Geography','Hindi'),
                Students=c(85,90,78,88,92,15))
ggplot(data=data,aes(x=Course,y=Students))+
  geom_bar(stat='identity',fill='green')+
  geom_text(aes(label=Students),vjust = -0.3)+
  ggtitle('No.of Students in each Course')+
  xlab('Course')+
  ylab('Number of Students')

#Q4
set.seed(123)
x <- rnorm(100)
df <- data.frame(x = x)
ggplot(df, aes(x = x)) +
  geom_histogram(bins=12,fill="lightblue",color = "black")+
  ggtitle('100 Numbers Random Histogram')+
  xlab('Values')+
  ylab('Counts')

#Q5
set.seed(123)
classA <- round(rnorm(30, mean = 75, sd = 10))
classB <- round(rnorm(30, mean = 68, sd = 12))
scores <- data.frame(Score = c(classA, classB),Class = factor(rep(c("Class A", "Class B"), each = 30)))
ggplot(scores, aes(x = Class, y = Score, fill = Class)) +
  geom_boxplot()+
  ggtitle('Boxplot of Two Classes')+
  xlab('Class')+
  ylab('Scores')

#Q6
x<-c(1:20)
y1<-c(55:74)
y2<-c(35:54)
par(mfrow = c(1, 2))
plot(x,y1,main="Scatter Plot",xlab="X",ylab="Y1",col="steelblue")
plot(x,y2,type="l",main="Line Plot",xlab="X",ylab="Y2",col="brown")

#Q7
set.seed(123)
gender<-rep(c("Male","Female"),each=50)
height<-c(rnorm(50,mean=180,sd=8),rnorm(50,mean=160,sd=12))
df<-data.frame(Gender=factor(gender),Height=height)

ggplot(df,aes(x=Gender,y=Height,fill=Gender)) +
  geom_boxplot()+
  ggtitle('Height Distribution by Gender')+
  xlab('Gender')+
  ylab('Height(cm)')+
  scale_fill_manual(values=c("Male"="lightblue","Female"="pink"))

#Q8
par(mfrow = c(1, 1))
temp_values<-c(
  15.2, 16.1, 20.3, 25.4, 28.0, 30.5,
  31.2, 29.8, 27.0, 22.5, 18.3, 16.0,
  15.5, 16.3, 19.8, 24.7, 27.9, 30.2,
  31.0, 29.5, 26.8, 22.1, 18.0, 15.8)
temp<-ts(temp_values,start=c(2023,1),frequency=12)
plot(temp,main="Monthly Temperature",xlab="Month",ylab="Temperature in Celcius",col="darkblue",lwd=2)

#Q9
set.seed(123)
df<-data.frame(x=rnorm(50),y=rnorm(50),group=factor(sample(c("A","B","C"),50,replace=TRUE)))
ggplot(df,aes(x=x,y=y,color=group))+
  geom_point(size=3)+
  ggtitle('Categorical Scatter Plot')+
  xlab('X-axis')+
  ylab('Y-axis')

#Q10
df<-read.csv("D:/Data/Github/Sheldon/Data Visualization/data1.csv")
print(df)
ggplot(df,aes(x=Address,y=Mark,fill=Address))+
  geom_boxplot()+
  ggtitle('Mark Distribution by City')+
  xlab('City')+
  ylab('Marks')
ggplot(df,aes(x=Age,y=Mark,color=Address))+
  geom_point(size = 4, alpha = 0.8)+
  ggtitle('Mark vs Age by City')+
  xlab('Age')+
  ylab('Marks')