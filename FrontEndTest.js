// const { count } = require("console");
// const https = require("https");
// /*
//  * Complete the function below.
//  * Use console.log to print the result, you should not return from the function.
//  */
// function getNumberOfMovies(substr) {
//   /*
//    * Endpoint: "https://jsonmock.hackerrank.com/api/movies/search/?Title=substr"
//    */

//   https
//     .get(
//       `https://jsonmock.hackerrank.com/api/movies/search/?Title=${substr}`,
//       (res) => {
//         //console.log('statusCode:', res.statusCode);
//         //console.log('headers:', res.headers);

//         res.on("data", (d) => {
//           //   process.stdout.write(d);
//           console.log(JSON.parse(d).total);
//         });
//       }
//     )
//     .on("error", (e) => {
//       //console.error(e);
//     });
// }

// //getNumberOfMovies("maze");

// // https://jsonmock.hackerrank.com/api/countries/search?name=

// function getCountries(s, p) {
//   let count = 0;

//   https.get(
//     `https://jsonmock.hackerrank.com/api/countries/search?name=${s}`,
//     (res) => {
//       let body = null;
//       res.on("data", (d) => {
//         //body += JSON.parse(d);
//         body = JSON.parse(d);
//         let total = JSON.parse(d).total;
//         let page = JSON.parse(d).page;
//         let t_pages = JSON.parse(d).total_pages;

//         // let data = JSON.parse(d).data;
//         // data.forEach((ele) => {
//         //   if (ele.population > p) {
//         //     count.push();
//         //   }
//         // });
//         // //console.log(count);
//         // page++;
//         // t_pages--;
//       });
//       res.on("end", () => console.log(body));
//     }
//   );

//   //console.log(count);
// }

//getCountries("in", 1000000);

async function getRequest() {
  let response = await fetch(
    "https://jsonmock.hackerrank.com/api/movies/search/?Title=in"
  );
}
